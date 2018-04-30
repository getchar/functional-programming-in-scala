class Chapter3 {
  // Ex 3.24
  def hasSubsequence(list: List[_], sub: List[_]): Boolean = {
    def startsHere(whole: List[_], part: List[_]): Boolean = {
      (whole, part) match {
        case (_, Nil) => true
	case (Nil, _) => false
	case (h1::t1, h2::t2) => h1 == h2 && startsHere(t1, t2)
      }
    }
    startsHere(list, sub) || (!list.isEmpty && hasSubsequence(list.drop(1), sub))
  }
}