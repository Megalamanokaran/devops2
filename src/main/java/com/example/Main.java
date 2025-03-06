public void printEvenNumbers() {
    System.out.print("numbers: [");
    for (int i = 2; i <= 10; i += 2) {
        if (i > 2) System.out.print(" "); // Add space between numbers
        System.out.print(i);
    }
    System.out.println("]"); // Closing bracket
}
