import java.util.Scanner

import scala.collection.{SortedMap, mutable}
import scala.collection.mutable.ArrayBuffer

object Main extends App {
  var in = new java.util.Scanner(new java.io.File("C:\\11.txt"))

  var words = ArrayBuffer[String]()
  while(in.hasNext()) words += in.next()

  var wordsCount = SortedMap[String, Int]() ++ (for(word <- words.distinct) yield (word, words.count(_ == word)))
  for((k, v) <- wordsCount) printf("Word %s contains %d times\n", k, v)
}

