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
        Node n = new Node(payload);

        if(this.head == null)
        {
            this.AddFront(n);
            //this.head = n;
        }
        else
        {
            Node currNode = this.head;

            while (curNode.GetNextNode() != null)
            {
                currNode = curNode.GetNextNode();
            }

            currNode.SetNextNode(n);

            //for (int i = 0; i < this.nodeCount; i++)
            //{
            //    if(currNode.GetNextNode() == null)
            //    {
            //        currNode.SetNextNode(n);
            //    }

            //    currNode = currNode.GetNextNode();
            this.nodeCount++;
            }
        }

        //this.nodeCount++;
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
        if(this.head != null)
        {
            Node currNode;
            currNode = this.head;
            this.head = this.head.GetNextNode();

            currNode.SetNextNode(null);
            this.nodeCount--;

            return currNode.GetPayload();
        }
    }

    public void RemoveEnd()
    {

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
