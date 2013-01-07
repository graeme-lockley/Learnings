package cucumber.first

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

World {
    state = [:]
}

Given(~'^I have a greeting app with "([^"]*)"$') { String greeting ->
    state.greet = new GreetApp(greeting);
}

When(~'^I ask it to say greet$') {->
    state.hi = state.greet.sayHi();
}


Then(~'^it should answer with "([^"]*)"$') { String greeting ->
    assert greeting.equals(state.hi)
}