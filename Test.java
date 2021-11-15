interface Test {
   void check();
   //comment
   default int sum(int a, int b) { return a + b;}
   static int constant() { return 1;}
   void check(int i);
   void check2();  //
   //comment222
   //comment222  nov 15
}

