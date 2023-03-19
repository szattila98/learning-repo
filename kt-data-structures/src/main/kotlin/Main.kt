fun main() {
    val myList = MyLinkedList()
    myList.addToBeginning(3)
    myList.addToBeginning(2)
    myList.addToBeginning(1)
    myList.addToEnd(4)
    myList.print()
    myList.delete(2)
    myList.print()
}