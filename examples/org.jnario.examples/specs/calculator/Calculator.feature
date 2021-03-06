/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
import calculator.Calculator

Feature: Addition

  In order to avoid silly mistakes
  As a math idiot
  I want to be told the sum of two numbers
  
  Scenario: Add two numbers
    Calculator calculator = new Calculator()
    Given I have entered "50" into the calculator
      calculator.enter(args.first)
    And I have entered "70" into the calculator
    When I press "add"
      calculator.press(args.first)
    Then the result should be "120" 
      calculator.result => args.first 