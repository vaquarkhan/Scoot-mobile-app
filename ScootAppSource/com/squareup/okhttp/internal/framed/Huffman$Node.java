package com.squareup.okhttp.internal.framed;

final class Huffman$Node
{
  private final Node[] children;
  private final int symbol;
  private final int terminalBits;
  
  Huffman$Node()
  {
    this.children = new Node['Ā'];
    this.symbol = 0;
    this.terminalBits = 0;
  }
  
  Huffman$Node(int paramInt1, int paramInt2)
  {
    this.children = null;
    this.symbol = paramInt1;
    paramInt2 &= 0x7;
    paramInt1 = paramInt2;
    if (paramInt2 == 0) {
      paramInt1 = 8;
    }
    this.terminalBits = paramInt1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\Huffman$Node.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */