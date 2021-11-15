interface Test {
   void check();
   //comment
   default int sum(int a, int b) { return a + b;}
   static int constant() { return 1;}
   //comment222
   void check2();
   void check3();
}

