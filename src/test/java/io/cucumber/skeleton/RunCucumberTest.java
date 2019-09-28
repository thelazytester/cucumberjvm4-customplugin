package io.cucumber.skeleton;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
    (plugin =
        { "io.cucumber.skeleton.CustomPlugin" })
    public class RunCucumberTest {
}
