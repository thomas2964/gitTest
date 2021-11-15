interface Test {
   void check();
   //comment
   default int sum(int a, int b) { return a + b;}
   static int constant() { return 1;}
   void check(int i);
   //comment222
   //comment222  nov 15
}

