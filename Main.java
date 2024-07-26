import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

class Main {

  JFrame frame;
  String name;
  String imagePNG;
  int num = 1;
  
  //Start
  JButton start;
  JTextArea intro;
  JPanel contentPane;

  //Game
  JPanel gamePane;
  JLabel score;
  int scoreCount = 0;
  JTextField pokemon;
  JButton guess;
  JLabel image;

  //End
  JPanel endPane;
  JLabel wrong;
  JLabel ty;
  JLabel scoreMsg;

  //Choose
  JPanel choosePane;
  JLabel helpChoose;
  JButton choose;
  JComboBox typeNames;
  JLabel score1;
  int type;

  public Main() {
    frame = new JFrame("Whos that Pokemon");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    infoListImage myInfoListImage = new infoListImage();
    imagePNG = myInfoListImage.iLI(num);

    //Start Screen
    contentPane = new JPanel();
    contentPane.setLayout(new GridLayout(2,2));

    intro = new JTextArea("How to Play: \nThe game will give you the image of a Pokemon. \nIf guessed correctly, you will be given the image of another Pokemon to guess from. \nIf you guess incorrectly then the game is over. \nIf you guess five Pokemon correctly in a row, you will be able to choose a type of pokemon to guess in the next round. \nGood Luck!");
    contentPane.add(intro);
    
    start = new JButton("Start");
    start.setActionCommand("Start");
    start.addActionListener(new buttonEvent());
    contentPane.add(start);

    //Game Screen
    gamePane = new JPanel();
    gamePane.setLayout(new BorderLayout(20, 15));

    image = new JLabel(new ImageIcon(imagePNG)); 
    image.setAlignmentX(JLabel.CENTER_ALIGNMENT);
    score = new JLabel("Score: " + scoreCount);
    guess = new JButton("Guess");
    guess.setActionCommand("Guess");
    guess.addActionListener(new buttonEvent());
    guess.setPreferredSize(new Dimension(80,50));
    pokemon = new JTextField();

    gamePane.add(score,BorderLayout.NORTH);
    gamePane.add(image,BorderLayout.CENTER);
    gamePane.add(pokemon,BorderLayout.SOUTH);
    gamePane.add(guess,BorderLayout.WEST);

    //End Screen
    endPane = new JPanel();
    endPane.setLayout(new GridLayout(3,1));

    wrong = new JLabel("Incorrect! The correct answer was: " + name);
    ty = new JLabel("Thanks for playing!");
    scoreMsg = new JLabel("Your final score was: " + scoreCount);

    endPane.add(wrong);
    endPane.add(scoreMsg);
    endPane.add(ty);

    //Choose Screen
    choosePane = new JPanel();
    choosePane.setLayout(new GridLayout(4,1));

    String[] names = {"Electric","Fire","Water","Ice", "Rock"};
    typeNames = new JComboBox(names);
    typeNames.setAlignmentX(JComboBox.LEFT_ALIGNMENT);
    typeNames.setSelectedIndex(0);
    
    typeNames.addActionListener(new dropDownEvent());
    helpChoose = new JLabel("Choose what type of Pokemon you would like to guess.");
    choose = new JButton("Choose");
    choose.setActionCommand("Choose");
    choose.addActionListener(new buttonEvent());
    score1 = new JLabel("Score: " + scoreCount);

    choosePane.add(score1);
    choosePane.add(helpChoose);
    choosePane.add(typeNames);
    choosePane.add(choose);
    
    frame.setContentPane(contentPane);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    //frame.setUndecorated(true); --CEB
    frame.setVisible(true);
  }
  class buttonEvent implements ActionListener {
    public void actionPerformed(ActionEvent event) {
     
      infoListImage myInfoListImage = new infoListImage();
      infoListName myInfoListName = new infoListName();
      chooseInfoImage myChooseInfoImage  = new chooseInfoImage();
      chooseInfoName myChooseInfoName  = new chooseInfoName();

      String eventName = event.getActionCommand();  

      if (eventName.equals("Start")) {
        num = (int)(1 + Math.random() * (100)); 
        imagePNG = myInfoListImage.iLI(num);
        name = myInfoListName.iLN(num);
        frame.getContentPane().removeAll();
        gamePane.add(score,BorderLayout.NORTH);
        image = new JLabel(new ImageIcon(imagePNG)); 
        image.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        gamePane.add(image,BorderLayout.CENTER);
        pokemon.setText("");
        gamePane.add(pokemon,BorderLayout.SOUTH);
        gamePane.add(guess,BorderLayout.WEST);
        gamePane.repaint();
        frame.setContentPane(gamePane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
        //frame.setUndecorated(true);
        frame.setVisible(true);
      }
      if ((eventName.equals("Guess")) && (pokemon.getText().trim().equalsIgnoreCase(name)) && ((scoreCount + 1) % 5 == 0)) {
        scoreCount = scoreCount + 1;
        score1.setText("Score: " + scoreCount);
        frame.getContentPane().removeAll();
        frame.repaint();
        choosePane.add(score1);
        choosePane.add(helpChoose);
        choosePane.add(typeNames);
        choosePane.add(choose);
        frame.setContentPane(choosePane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
      }
      if ((eventName.equals("Guess")) && (pokemon.getText().trim().equalsIgnoreCase(name))) {
        num = (int)(1 + Math.random() * (100)); 
        imagePNG = myInfoListImage.iLI(num);
        name = myInfoListName.iLN(num);
        scoreCount = scoreCount + 1;
        score.setText("Score: " + scoreCount);
        frame.getContentPane().removeAll();
        gamePane.add(score,BorderLayout.NORTH);
        image = new JLabel(new ImageIcon(imagePNG)); 
        image.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        gamePane.add(image,BorderLayout.CENTER);
        pokemon.setText("");
        gamePane.add(pokemon,BorderLayout.SOUTH);
        gamePane.add(guess,BorderLayout.WEST);
        gamePane.repaint();
        frame.setContentPane(gamePane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
      }
      else if ((eventName.equals("Guess"))) {
        scoreMsg.setText("Your final score was: " + scoreCount);
        wrong.setText("Incorrect! The correct answer was: " + name);
        frame.getContentPane().removeAll();
        frame.repaint();
        frame.setContentPane(endPane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
      }
      if (eventName.equals("Choose")) {
        num = (int)(1 + Math.random() * (10));
        imagePNG = myChooseInfoImage.cII(type, num);
        name = myChooseInfoName.cIN(type, num);
        score.setText("Score: " + scoreCount);
        frame.getContentPane().removeAll();
        gamePane.add(score,BorderLayout.NORTH);
        image = new JLabel(new ImageIcon(imagePNG)); 
        image.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        gamePane.add(image,BorderLayout.CENTER);
        pokemon.setText("");
        gamePane.add(pokemon,BorderLayout.SOUTH);
        gamePane.add(guess,BorderLayout.WEST);
        gamePane.repaint();
        frame.setContentPane(gamePane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
      }
    }
  }
  
  class dropDownEvent implements ActionListener {

    public void actionPerformed (ActionEvent event) {

      JComboBox comboBox = (JComboBox)event.getSource();

      //This is the statement to get the drop down value
      String typeName = (String)comboBox.getSelectedItem();
      if (typeName == "Electric"){
        type = 0;
      }
      else if (typeName == "Fire") {
        type = 1;
      }
      else if (typeName == "Water") {
        type = 2;
      }
      else if (typeName == "Ice") {
        type = 3;
      }
      else  if (typeName == "Rock") {
        type = 4;
      }

    }
  }

  private static void runGUI() {

    JFrame.setDefaultLookAndFeelDecorated(true);
    Main greeting = new Main();

  }
    public static void main(String[] args) {

    javax.swing.SwingUtilities.invokeLater(new Runnable() {

      public void run() {
        runGUI();
      }

    }
    );

  }
}
