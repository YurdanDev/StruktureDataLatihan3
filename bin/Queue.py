import queue

def queue_example():
    q = queue.Queue()
    q.put("Python")
    q.put("Java")
    q.put("C++")
    q.put("JavaScript")
    
    print("Get:", q.get())
    print("Queue Empty?", q.empty())
    print("Queue Size:", q.qsize())
    print("Get Nowait:", q.get_nowait())
    print("Queue Full?", q.full())
    
if __name__ == "__main__":
    queue_example()
