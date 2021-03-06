/*
 *     Copyright 2021 uJar Boot Camp @ http://ujar.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ujar.beginner.derek_banas.learn.java_basics.annotations.person;

@JsonSerializable
public class Person {

  @JsonElement
  private String firstName;

  @JsonElement
  private String lastName;

  @JsonElement(key = "personAge")
  private String age;

  private String address;

  @Init
  private void initNames() {
    this.firstName = this.firstName.substring(0, 1).toUpperCase()
                     + this.firstName.substring(1);
    this.lastName = this.lastName.substring(0, 1).toUpperCase()
                    + this.lastName.substring(1);
  }
}
