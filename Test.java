interface Test {
   void check();
   void check2();
   void check3();//
   void test123();
   //mistake2//
   //comment
   default int sum(int a, int b) { return a + b;}
   static int constant() { return 1;}
}

