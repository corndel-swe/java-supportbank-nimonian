package com.corndel.supportbank.exercises;

@SuppressWarnings("unused")
public class UserId {
  private String id;

  public UserId(String id) {
    this.id = id;
  }

  /**
   * Validates the user ID based on specific criteria.
   *
   * @param id The user ID to validate.
   * @return true if the ID passes all validations.
   * @throws IllegalArgumentException if any validation fails.
   */
  public boolean validate() {
    if (this.id.length() % 2 == 0) {
      throw new IllegalArgumentException("The id must be an odd number of characters long");
    }

    if (!this.id.contains("a")) {
      throw new IllegalArgumentException("The id must contain the letter 'a'");
    }

    if (!this.id.equals(this.id.toLowerCase())) {
      throw new IllegalArgumentException("The id must be all lowercase");
    }

    // If all validations pass, return true.
    return true;
  }
}
