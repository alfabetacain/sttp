package sttp.client

import org.scalajs.dom.experimental.URL

import scala.scalajs.js.URIUtils

private[client] object UriCompatibility {

  def encodeDNSHost(s: String): String = {
    // the URL class IDN formats and escapes the host
    new URL(s"http://$s").host
  }

  def encodeQuery(s: String, enc: String): String = URIUtils.encodeURIComponent(s)
}
