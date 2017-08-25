package com.mmanrique.bakery.servlet

import org.scalatra.ScalatraServlet

class BakeryServlet extends ScalatraServlet {
  get("/"){
    <h1>Hello Ponin</h1>
  }
}
