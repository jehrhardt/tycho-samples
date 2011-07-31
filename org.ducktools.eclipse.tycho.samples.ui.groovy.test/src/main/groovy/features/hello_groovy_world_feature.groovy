/**
 * Copyright (c) 2011 Jan Ehrhardt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Jan Ehrhardt
 */
package features

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot

import spock.lang.Specification

/**
 * @author <a href="https://github.com/derjan1982">Jan Ehrhardt</a>
 */
class hello_groovy_world_feature extends Specification {

  def "the view should have the title hello world"() {
    given: "the hello world view"
    def bot = new SWTWorkbenchBot()
    bot.perspectiveById("org.eclipse.jdt.ui.JavaPerspective").activate()
    def helloWorldView = bot.viewById("org.ducktools.eclipse.tycho.samples.ui.views.HelloWorldGroovyView")

    expect: "the title is 'Hello Groovy World'"
    assert "Groovy Hello World" == helloWorldView.title
  }
}
