/**
 * Copyright © 2014 Xiong Zhijun, All Rights Reserved.
 * Email : hust.xzj@gmail.com
 */

/**
 * @author Xiong Zhijun
 * @email hust.xzj@gmail.com
 *
 */
if (!session) {
  session = request.getSession(true)
}

if (!session.counter) {
      session.counter = 1
}

html.html {    // html is implicitly bound to new MarkupBuilder(out)
  head {
      title("Groovy Servlet")
  }
  body {
    p("Hello, request count: ${session.counter}! ${new Date()}")
  }
}
session.counter = session.counter + 1