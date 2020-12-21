package org.springframework.scripting.groovy

import org.springframework.beans.factory.FactoryBean

class TestFactoryBean implements FactoryBean {

	@Override
    boolean isSingleton() {
		true
	}

	@Override
    Class getObjectType() {
		String.class
	}

	@Override
    Object getObject() {
		"test"
	}
}
