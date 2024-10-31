import org.hibernate.Session;
import org.mentawai.ajax.AjaxConsequence;
import org.mentawai.ajax.renders.JSONArrayAjaxRender;
import org.mentawai.ajax.renders.JSONObjectAjaxRender;
import org.mentawai.core.NullConsequence;
import org.mentawai.example.productsearch.Product;
import org.mentawai.example.productsearch.ProductAction;
import org.mentawai.example.productsearch.ProductServiceImpl;
import org.mentawai.example.productsearch.dao.impl.ProductDAOHibernateImpl;
import org.mentawai.filter.DIFilter;
import org.mentawai.filter.HibernateFilter;
import org.mentawai.filter.InjectionFilter;
import org.mentawai.filter.IoCFilter;
import org.mentawai.filter.TransactionFilter;
import org.mentawai.filter.VOFilter;
import org.mentawai.transaction.HibernateTransaction;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {

    public void loadActions() {

        // Register the IoC components.
        ioc("productService", ProductServiceImpl.class);
        ioc("transaction", HibernateTransaction.class);
        ioc("productDAO", ProductDAOHibernateImpl.class);

        // Add a IoCFilter, which will instanciate and inject the registered
        // IoC components in the action's input.
        filter(new IoCFilter());
        // Add a HibernateFilter, which will create and inject a Hibernate
        // Session in the action's input.
        filter(new HibernateFilter());
        // Add a DIFilter, which will inject into the objects requested by the
        // action the Hibernate session created by the Hibernate filter.
        filter(new DIFilter("session", Session.class));
        // Add a DIFilter, which will inject into the objects requet by the
        // action the ProductDAO created by the IoCFilter.
        filter(new DIFilter("productDAO", ProductDAOHibernateImpl.class));
        // Add a TransactionFilter, which begins a transaction before the
        // action's exection and commit it if the actions return one of the
        // configurated results or rollback the action if the result is not one
        // of the configurated or if an exception is throwed.
        filter(new TransactionFilter(new String[] { SUCCESS, "add", "delete",
                "update"}));
        // Add a VOFilter, which will create a Product object and inject into
        // the created object attributes the values that are in the action's
        // input.
        filter(new VOFilter(Product.class, "product"));
        
        // Add a InjectionFilter, which will inject into the actions attibutes
        // the values that are in the action's input.
        filter(new InjectionFilter(), true);


        action("product", ProductAction.class)
        .on(SUCCESS,new AjaxConsequence(new JSONArrayAjaxRender("products")))
        .on("add", new NullConsequence())
        .on("delete", new NullConsequence())
        .on("update", new NullConsequence())
        .on("getById", new AjaxConsequence(new JSONObjectAjaxRender("product")));
    }
}
