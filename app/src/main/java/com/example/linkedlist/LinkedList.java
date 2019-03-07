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
        Node currNode = this.head;

        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            for (int i = 0; i < this.nodeCount; i++)
            {
                if(currNode.GetNextNode() == null)
                {
                    currNode.SetNextNode(n);
                }

                currNode = currNode.GetNextNode();
            }
        }

        this.nodeCount++;
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
