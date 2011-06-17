package scalanlp.smr
package storage

import java.net.URI
import scalanlp.serialization.DataSerialization

/**
 * 
 * @author dlwh
 */

trait Storage {
  def store[T:DataSerialization.Writable](name: String, t: T):URI
  def store[T:DataSerialization.Writable](t: T):URI
  def load[T:DataSerialization.Readable](uri: URI):Option[T]
}

object Storage {
}
