def rubyStyleForLoop: Unit = {
  println("for loop using Ruby-style iteration")
  args.foreach { args =>
    println(args)
  }
}

rubyStyleForLoop
