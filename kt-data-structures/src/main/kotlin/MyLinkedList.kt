class MyLinkedList {

    private var head: Node? = null

    fun addToBeginning(value: Int) {
        val newNode = Node(value)
        newNode.next = head
        head = newNode
    }

    fun addToEnd(value: Int) {
        val newNode = Node(value)
        if (head == null) {
            head = newNode
            return
        }
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        current?.next = newNode
    }

    fun delete(value: Int) {
        if (head == null) {
            return
        }
        if (head?.value == value) {
            head = head?.next
        }
        var current: Node? = head
        var previous: Node? = null
        while (current?.next != null && current.value != value) {
            previous = current
            current = current.next
        }
        if (previous != null && current?.value == value) {
            previous.next = current.next
        }
    }

    fun print() {
        var current = head
        while (current != null) {
            print("${current.value} ")
            current = current.next
        }
        println()
    }

    private class Node(var value: Int) {
        var next: Node? = null
    }
}
