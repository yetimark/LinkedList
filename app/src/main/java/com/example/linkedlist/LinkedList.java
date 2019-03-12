package com.example.linkedlist;

public class LinkedList
{
    private Node head;
    private int nodeCount;

    public LinkedList()
    {
        this.head = null;
        this.nodeCount = 0;
    }

    public void AddFront(int payload)
    {
        Node n = new Node(payload);

        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            n.SetNextNode(this.head);
            this.head = n;
        }

        this.nodeCount++;
    }

    public void AddEnd(int payload)
    {

        if(this.head == null)
        {
            this.AddFront(payload);
        }
        else
        {
            Node currNode = this.head;

            while (currNode.GetNextNode() != null)
            {
                currNode = currNode.GetNextNode();
            }

            Node n = new Node(payload);
            currNode.SetNextNode(n);
            this.nodeCount++;
        }
    }

    public void AddAtIndex(int payload, int index)
    {
        Node n = new Node(payload);
        Node currNode = this.head;

        if(index == 0)
        {
            this.AddFront(payload);
        }
        else if(index == this.nodeCount - 1)
        {
            this.AddEnd(payload);
        }
        else
        {
            for(int i = 0; i < index - 1; i++)
            {
                currNode = currNode.GetNextNode();
            }

            n.SetNextNode(currNode.GetNextNode());
            currNode.SetNextNode(n);
            this.nodeCount++;
        }
    }

    //removes the front node and returns the payload 
    public int RemoveFront()
    {
        int payload = -1;
        if(this.head.GetNextNode() == null)
        {
            this.head = null;
            System.out.println("You just removed head. Your linked list is broken");
        }
        else
        {
            Node currNode;
            currNode = this.head;
            this.head = this.head.GetNextNode();

            currNode.SetNextNode(null);
            this.nodeCount--;

            payload = currNode.GetPayload();
        }
        return payload;
    }

    //rem
    public int RemoveAtIndex(int index)
    {
        int payload = -1;
        if(index == 0)
        {
            payload = RemoveFront();
        }
        else
        {
            Node removedNode;
            Node currNode;
            currNode = this.head;

            for(int i = 0; i < index - 1; i++)
            {
                currNode = currNode.GetNextNode();
            }

            removedNode = currNode.GetNextNode();

            currNode.SetNextNode(removedNode.GetNextNode());

            this.nodeCount--;
            removedNode.SetNextNode(null);

            removedNode.GetPayload();
        }
        return payload;
    }


    public int RemoveEnd()
    {
        int payload = -1;
        if(this.head.GetNextNode() == null)
        {
            payload = RemoveFront();
        }
        else
        {
            Node currNode;
            currNode = this.head;

            Node lastNode;

            //sets currNode to the second last node in the list
            while(currNode.GetNextNode().GetNextNode() != null)
            {
                currNode = currNode.GetNextNode();
            }

            lastNode = currNode.GetNextNode();

            //severs connection
            currNode.SetNextNode(null);
            this.nodeCount--;
            payload = lastNode.GetPayload();
        }

        return payload;
    }

    //gets the payload at a certain node index
    public int GetAtIndex(int index)
    {
        Node currNode = this.head;
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.GetNextNode();
        }
        return currNode.GetPayload();
    }

    public void Display()
    {
        String answer = "";
        Node currNode = this.head;

        for(int i = 0; i < this.nodeCount; i++)
        {
            answer += currNode.GetPayload() + " -> ";
            currNode = currNode.GetNextNode();
        }

        System.out.println(answer);
    }
}
