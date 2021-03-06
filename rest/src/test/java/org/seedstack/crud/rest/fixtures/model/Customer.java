/*
 * Copyright © 2013-2018, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.seedstack.crud.rest.fixtures.model;

import org.seedstack.business.domain.BaseAggregateRoot;

public class Customer extends BaseAggregateRoot<CustomerId> {
    private final CustomerId id;
    private int age = 0;

    public Customer(CustomerId id) {
        this.id = id;
    }

    @Override
    public CustomerId getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
