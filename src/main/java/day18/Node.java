package day18;

public class Node {
  private int value;
  private Node leftSon;
  private Node rightSon;

  public void setLeftSon(Node leftSon) {
    this.leftSon = leftSon;
  }

  public void setRightSon(Node rightSon) {
    this.rightSon = rightSon;
  }

  public Node(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public Node getLeftSon() {
    return leftSon;
  }

  public Node getRightSon() {
    return rightSon;
  }

  @Override
  public String toString() {
    return "Node{" +
        "value=" + value +
        ", leftSon=" + leftSon +
        ", rightSon=" + rightSon +
        '}';
  }
}
