object RepeatedArguments extends App {

  // without repeated parameters:
  def lengthOfString(strings: Seq[String]): Unit = {
    strings.foreach(s => println(s"$s -> ${s.length}"))
  }

  // with repeated parameters:
  def lengthOfStringsR(strings: String*): Unit = {
    strings.foreach(s => println(s"$s -> ${s.length}"))
    lengthOfStringsR("a", "bb", "ccc", "dddd")
  }

  // repeated parameters but caller has array:
  def incrementBy1(nums: Int*) = nums.map(_ + 1)

  val nums = incrementBy1(1, 2, 3, 4, 5, 6)
  nums.foreach(println)
}
