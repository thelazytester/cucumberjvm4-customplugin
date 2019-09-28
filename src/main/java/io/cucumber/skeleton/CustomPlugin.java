package io.cucumber.skeleton;

import cucumber.api.event.*;

public class CustomPlugin implements ConcurrentEventListener {

    private int testStepCount = 0;

    @Override public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestRunStarted.class, testRunStartedEventHandler);
        publisher.registerHandlerFor(TestCaseStarted.class, testCaseStartedEventHandler);
        publisher.registerHandlerFor(TestStepStarted.class, testStepStartedEventHandler);
        publisher.registerHandlerFor(TestStepFinished.class, testStepFinishedEventHandler);
        publisher.registerHandlerFor(TestCaseFinished.class, testCaseFinishedEventHandler);
        publisher.registerHandlerFor(TestRunFinished.class, testRunFinishedEventHandler);
    }

    private EventHandler<TestRunStarted> testRunStartedEventHandler = new EventHandler<TestRunStarted>() {
        @Override public void receive(TestRunStarted event) {
            System.out.println("From Custom Plugin :: Test Run Started");
        }
    };

    private EventHandler<TestRunFinished> testRunFinishedEventHandler = new EventHandler<TestRunFinished>() {
        @Override public void receive(TestRunFinished event) {
            System.out.println("From Custom Plugin :: Test Run Finished");
        }
    };

    private EventHandler<TestCaseStarted> testCaseStartedEventHandler = new EventHandler<TestCaseStarted>() {
        @Override public void receive(TestCaseStarted event) {
            System.out.println("From Custom Plugin :: Scenario '" + event.getTestCase().getName() + "' Started");
        }
    };

    private EventHandler<TestCaseFinished> testCaseFinishedEventHandler = new EventHandler<TestCaseFinished>() {
        @Override public void receive(TestCaseFinished event) {
            System.out.println("From Custom Plugin :: Scenario '" + event.getTestCase().getName() + "' Finished");
        }
    };

    private EventHandler<TestStepStarted> testStepStartedEventHandler = new EventHandler<TestStepStarted>() {
        @Override public void receive(TestStepStarted event) {
            System.out.println("From Custom Plugin :: Test Step " + ++testStepCount + " Started");
        }
    };

    private EventHandler<TestStepFinished> testStepFinishedEventHandler = new EventHandler<TestStepFinished>() {
        @Override public void receive(TestStepFinished event) {
            System.out.println("From Custom Plugin :: Test Step " + testStepCount + " Finished");
        }
    };

}

