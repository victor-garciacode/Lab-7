public class Counter implements ActionListener {
JLabel leftLabel;
JLabel rightLabel;
int leftCount;
int rightCount;

Counter(){
  JFrame frame = new JFrame("Let's Count");
  frame.setLayout(new FlowLayout());
  frame.setSize(200,110);
  JButton left = new JButton("Left");
  JButton right = new JButton("Right");
  leftCount = 0;
  rightCount = 0;
  left.addActionListener(this);
  right.addActionListener(this);
  frame.add(left);
  frame.add(right);
  leftLabel = new JLabel("Count " + leftCount);
  rightLabel = new JLabel("Count " + rightCount);
  frame.add(leftLabel);
  frame.add(rightLabel);
  JButton reset = new JButton("Reset");
  reset.addActionListener(this);
  frame.add(reset);
  frame.setVisible(true);
}
public void actionPerformed(ActionEvent a){
  if(a.getActionCommand().equals("Left")){
    leftCount++;
    leftLabel.setText("" + leftCount);
  }
  else if(a.getActionCommand().equals("Right")){
    rightCount++;
  leftLabel.setText("" + leftCount);
  }
  else{
  leftCount = 0;
  rightCount = 0;
  leftLabel.setText("" + leftCount);
  rightLabel.setText("" + rightCount);
  }
}
}