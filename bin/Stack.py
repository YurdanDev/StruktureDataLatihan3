class ExampleStack:
    def main(self):
        at = []
        at.append("Aku")
        at.append("Anak")
        at.append("Indonesia")

        print("Next : " + at[-1])
        at.append("Raya")
        print(at.pop())
        at.append(" : ")

        count = self.searchStack(at, "Aku")
        while count != -1 and count > 1:
            at.pop()
            count -= 1

        print(at.pop())
        print(not at)

    def searchStack(self, stack, item):
        tempStack = []
        count = 0

        while len(stack) > 0:
            current = stack.pop()
            tempStack.append(current)
            count += 1

            if current == item:
                while len(tempStack) > 0:
                    stack.append(tempStack.pop())

                return count

        while len(tempStack) > 0:
            stack.append(tempStack.pop())

        return -1

ExampleStack().main()
