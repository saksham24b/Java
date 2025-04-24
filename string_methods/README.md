## Some common methods

`String name = "Saksham";`

` name.length()` -> Returns length of String name  
`name.toLowerCase()` -> Returns a new string which has all the lowercase characters from the string name  
`name.toUpperCase()` -> Returns a new string which has all the uppercase characters from the string name  
`name.trim()` -> Returns a new string after removing all the leading and trailing spaces from the original string  
`name.Substring(int start, int end)` -> Returns a substring from start to the end   
`name.replace('h','s')` -> Returns a new string after replacing h with s  
`name.startsWith("Sak")` -> Returns true if name starts with string "Sak" else false  
`name.endsWith("am")` -> Returns true if name ends with string "am"  
`name.charAt(2)` -> Returns character at the given index  
`name.indexOf(s)` -> Returns the index of the first occurrence of the character "s"  
`name.lastIndexOf("s", 2)` -> Returns the last index of the given string before index 2  
`name.equals("Saksham")` -> Returns true if the given string is equal to "Saksham" this method is <u>Case Sensitive</u>   
`name.equalsIgnorecase("saksham")` -> Same as equal but not case sensitive