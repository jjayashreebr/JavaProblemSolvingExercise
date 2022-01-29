package problems.book;

public class TestBook {
	Book[] myBook = new Book[5];

	TestBook() {
		myBook[0] = new Book(1);
	    myBook[1] = new Book(2);
	    myBook[2] = new Book(3);
	    myBook[3] = new Book(4);
	    myBook[4] = new Book(5);
	}

	public int numOfBooks() {
		return myBook.length;
	}

	public void findBookById(int in) throws BookNotFoundException {
		// TODO Auto-generated method stub
		for (int i = 0; i < myBook.length; i++) {
			if (in == myBook[i].id) {
				System.out.println("found");
			} else {
				throw new BookNotFoundException("Book not found");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBook test = new TestBook();
		System.out.println(test.numOfBooks());
		try {
			test.findBookById(2);
		} catch (BookNotFoundException e) {
			e.printStackTrace();
		}
	}
}
