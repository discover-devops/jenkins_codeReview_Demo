package com.asimio.demo.rest;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.asimio.demo.service.SomeBusinessService;

@RunWith(MockitoJUnitRunner.class)
public class DemoControllerTest {

    @Mock
    private SomeBusinessService mockSomeBusinessService;

    private DemoController demoController;

    @Before
    public void setup() {
        this.demoController = new DemoController(this.mockSomeBusinessService);
    }

    @Test
    public void shouldRetrieveAnEntity() {
        // Given
        Mockito.when(this.mockSomeBusinessService.findEntity("blah")).thenReturn("meh");
        // When
        ResponseEntity<String> actualResponse = this.demoController.findEntity("blah");
        // Then
        Assert.assertThat(actualResponse.getStatusCode(), Matchers.equalTo(HttpStatus.OK));
        Assert.assertThat(actualResponse.getBody(), Matchers.equalTo("meh"));
    }
}