package sttp.client3.armeria.fs2

import cats.effect.IO
import sttp.client3.Backend
import sttp.client3.impl.cats.CatsTestBase
import sttp.client3.testing.HttpTest

class ArmeriaFs2HttpTest extends HttpTest[IO] with CatsTestBase {
  override val backend: Backend[IO] = ArmeriaFs2Backend()

  override def supportsHostHeaderOverride = false
  override def supportsCancellation = false
  override def supportsAutoDecompressionDisabling = false
  override def supportsDeflateWrapperChecking = false // armeria hangs
}
