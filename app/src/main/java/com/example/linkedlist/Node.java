package com.example.linkedlist;

public class Node
{
    private int payload;
    private Node nextNode;

    public Node(int payload)
    {
        this.payload = payload;
        this.nextNode = null;
    }

    public void SetNextNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }

    public int GetPayload()
    {
        return this.payload;
    }

    public Node GetNextNode()
    {
        return this.nextNode;
    }
}
