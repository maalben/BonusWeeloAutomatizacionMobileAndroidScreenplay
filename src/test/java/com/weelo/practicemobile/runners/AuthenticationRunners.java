package com.weelo.practicemobile.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/authentication.feature",
        glue = "com.weelo.practicemobile.stepdefinitions",
        snippets = SnippetType.CAMELCASE
        )
public class AuthenticationRunners {
}
