package com.asimio.demo.service;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DefaultSomeBusinessServiceTest {

    private SomeBusinessService someBusinessService;

    @Before
    public void setup() {
        this.someBusinessService = new DefaultSomeBusinessService();
    }

   // @Test
   // public void shouldRetrieveEntityForKnownId() {
   //     String actual = this.someBusinessService.findEntity("blah");
   //     Assert.assertThat(actual, Matchers.equalTo("Retrieved entity with id: blah"));
   // }
}
