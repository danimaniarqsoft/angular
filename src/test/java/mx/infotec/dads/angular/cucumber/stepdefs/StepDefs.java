package mx.infotec.dads.angular.cucumber.stepdefs;

import mx.infotec.dads.angular.AngularApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AngularApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
