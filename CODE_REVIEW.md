# Naming conventions
* **Issue 1 – Non-descriptive parameter names:** In `public static void add(String n, int a, double g)`, single-letter variable names (`n`, `a`, `g`) make the method signature unclear. They should be renamed to `name`, `age`, and `grade`.
* **Issue 2 – Generic method and loop variable names:** `add` and `display` should be renamed to `addStudent` and `displayStudents` to clarify what is being acted upon, and the loop variable `s` in `for (String s : students)` should be renamed to `student`.

# Code formatting
* **Issue 3 – Lack of vertical spacing and documentation:** Fields, methods, and logical blocks are packed together without blank lines separating them, and there are no Javadoc comments (`/** ... */`) explaining the purpose of the class or methods.

# Logical errors
* **Issue 4 – Loss of age and grade data:** Only the student's name (`students.add(n)`) is stored in the `ArrayList`. The `age` and `grade` arguments are printed once and immediately discarded, so `display()` cannot show complete student records.
* **Issue 5 – Duplicate student entries allowed:** Calling `add("John", 20, 85)` twice registers the exact same student twice without checking for existing records.
* **Issue 6 – Silent output when list is empty:** Calling `display()` when `students` is empty produces no console output instead of informing the user (e.g., `"No students registered."`).

# Input validation
* **Issue 7 – Empty or blank names accepted:** Calling `add("", -5, 150)` adds an empty string `""` to the list. The method must reject `null`, empty (`isEmpty()`), or whitespace-only (`isBlank()`) names.
* **Issue 8 – Invalid age and grade values accepted:** Negative ages (`-5`) and out-of-bounds grades (`150`) are accepted without validation. Age must be positive (e.g., `age > 0` or `15 <= age <= 100`), and grades must fall within a valid range (e.g., `0.0 <= grade <= 100.0`).

# Exception handling
* **Issue 9 – Unhandled `NullPointerException` risk:** Passing `null` as the student name (`add(null, 20, 85)`) is not guarded against. Any subsequent string operations (such as `.trim()` or `.equalsIgnoreCase()`) will throw an unhandled `NullPointerException`.

# Duplicate code
* **Issue 10 – Repeated `System.out.println` statements:** Inside `add()`, four consecutive `System.out.println(...)` calls are used to print registration details. These can be simplified into a single formatted output statement (`System.out.printf(...)`) or a helper/toString method.

# Security
* **Issue 11 – Unsanitized user input (Log/Console Injection risk):** User-supplied strings are printed directly to the console without trimming or stripping newline/control characters (`\n`, `\r`), which could allow forged console output if external input is introduced.

# Maintainability
* **Issue 12 – Primitive obsession and tight coupling:** Storing student data as `ArrayList<String>` instead of a dedicated `Student` object (`name`, `age`, `grade`) makes future features (updating grades, searching, sorting) difficult. Additionally, mixing data storage with console printing inside `static` methods prevents isolated unit testing and multi-instance use.
