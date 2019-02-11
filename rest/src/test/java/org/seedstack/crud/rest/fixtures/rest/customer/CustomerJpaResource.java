/*
 * Copyright © 2013-2018, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.seedstack.crud.rest.fixtures.rest.customer;

import javax.transaction.Transactional;
import javax.ws.rs.Path;
import org.seedstack.crud.rest.BaseCrudResource;
import org.seedstack.crud.rest.fixtures.model.customer.Customer;
import org.seedstack.crud.rest.fixtures.model.customer.CustomerId;
import org.seedstack.jpa.JpaUnit;

@Path("/jpa-customers")
@Transactional
@JpaUnit("unit1")
public class CustomerJpaResource
        extends BaseCrudResource<Customer, CustomerId, CustomerRepresentation> {
}
