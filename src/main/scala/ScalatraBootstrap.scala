import javax.servlet.ServletContext

import org.scalatra.LifeCycle
import servlet.BakeryServlet

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext): Unit = {

    // mount servlets like this:
    context mount (new BakeryServlet, "/")
  }
}
