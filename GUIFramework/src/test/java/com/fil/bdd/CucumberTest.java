package com.fil.bdd;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",plugin={"pretty","json:target/cucumber.json"}
)
public class CucumberTest {

}
