class Linkedlist1
{
    Node first;
    static class Node{
        int data;
        Node link;
        Node(int data)
        {
            this.data = data;
            link = null;
        }
    }

    boolean fnsearchNode(Node first,int elem)
    {
        Node temp;
        if(first == null)
        {
            System.out.println("list is empty");
            return false;
        }
        temp = first;
        while(temp != null && temp.data != elem)
        {
            temp = temp.link;
        }
        if(temp == null)
            return false;
        else
            return true;
    }

    public static Node Reverse_List(Node first)
    {
        Node cur,prev,next;
        if(first == null)
        {
            System.out.println("list is empty");
        }
        prev = first;
        cur = first.link;
        next = cur.link;
        prev.link = null;
        while(cur.link != null)
        {
            cur.link = prev;
            prev = cur;
            cur = next;
            next = next.link;
        }
        cur.link = prev;
        return cur;
        
    }

    public static Node fnInsert_OrderedList(Node first,int elem)
    {
        Node temp,prev = null,cur = first;
        temp = new Node(elem);
        if(first == null)
        {
            System.out.println("inserting first element in the list");
            return temp;
        }
        if(elem < first.data)
        {
            temp.link = first;
            return temp;
        }
        while(cur != null && cur.data < elem)
        {
            prev = cur;
            cur = cur.link;
        }
        prev.link = temp;
        temp.link = cur;
        return first;

    }
}