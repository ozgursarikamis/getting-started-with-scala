object UsingFunctionValue extends App {

  class Priority(val value: String) {
    override def toString: String = value
  }

  class Status(val value: String) {
    override def toString: String = value
  }

  class Task(val value: String, val priority: Priority, val status: Status) {
    override def toString: String = s"[P: $priority][S:$status] - $value"
  }

  val high = new Priority("High")
  val medium = new Priority("Medium")
  val low = new Priority("Low")

  val todo = new Status("todo")
  val inProgress = new Status("in progress")
  val done = new Status("done")

  val t1 = new Task("Task 1", high, inProgress)
  val t2 = new Task("Task 2", high, inProgress)
  val t3 = new Task("Task 3", medium, inProgress)
  val t4 = new Task("Task 4", medium, inProgress)
  val t5 = new Task("Task 5", low, inProgress)
  val t6 = new Task("Task 6", high, inProgress)
  val t7 = new Task("Task 7", medium, inProgress)

  val tasks: Seq[Task] = Seq(t1, t2, t3, t4, t5, t6, t7)

  def getHighPriorityTasks = {
    for (task <- tasks; if task.priority == high)
      yield task
  }

  def getLowPriorityTask = {
    for (task <- tasks; if task.priority == low)
      yield task
  }

  def getTasksInProgress = {
    for (task <- tasks; if task.status == inProgress)
      yield task
  }

  println("========================================")
  println("High P")
  getHighPriorityTasks foreach println
  println("Low P")
  getLowPriorityTask foreach println
  println("In Progress")
  getTasksInProgress foreach println
  println("========================================")

  for (w <- 0 to 10) println(w)
  println("========================================")

  for (w <- 0 until 10) println(w)

  for (w <- 0 to 3; z <- 8 until 12) println(w, z)

  println("========================================")

  val rankList = List(1, 2, 3, 4, 5, 6)
  for (item <- rankList) println(item)


  println("========================================")

  // FOR LOOPS WITH FILTER:
  for (rank <- rankList; if rank > 4) println(rank)

}
