/**
 * Copyright 2005 Darren L. Spurgeon
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ajaxtags.demo;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * A Car entity with make and model properties.
 * 
 * @author Darren Spurgeon
 * @version $Revision: 1.1 $ $Date: 2005/08/03 19:09:08 $
 */
public class Car implements Serializable {

  private String make;
  private String model;

  /**
   * Constructor for Car.
   */
  public Car() {
    super();
  }

  /**
   * Constructor for Car.
   */
  public Car(String make, String model) {
    super();
    this.make = make;
    this.model = model;
  }

  /**
   * @return Returns the make.
   */
  public String getMake() {
    return this.make;
  }

  /**
   * @param make The make to set.
   */
  public void setMake(String make) {
    this.make = make;
  }

  /**
   * @return Returns the model.
   */
  public String getModel() {
    return this.model;
  }

  /**
   * @param model The model to set.
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * @see java.lang.Object#toString()
   */
  public String toString() {
    return new ToStringBuilder(this).append("make", make).append("model", model).toString();
  }

}
