package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withTags("owesMoney", "friends")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withTags("friends")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo")
            .withTags("owesMoney", "DBS")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street")
            .withPicture("/images/placeholder_image.jpg").build();
    // Without certain fields (still typical)
    // Without phone
    public static final Person HENRY = new PersonBuilder().withName("Henry Golding").withoutPhone()
            .withEmail("henry@example.com").withAddress("Crazy Rich Street")
            .withPicture("/images/placeholder_image.jpg").build();
    // Without email
    public static final Person IANNA = new PersonBuilder().withName("Ianna Cluse").withPhone("83848586")
            .withoutEmail().withAddress("24 Recluse Avenue")
            .withPicture("/images/placeholder_image.jpg").build();
    // Without address
    public static final Person JENNY = new PersonBuilder().withName("Jenny Khiu").withPhone("91234523")
            .withEmail("jenny@example.com").withoutAddress()
            .withPicture("/images/placeholder_image.jpg").build();
    // Contacts with tags to be deleted
    public static final Person KENNETH = new PersonBuilder().withName("Kenneth Koh").withPhone("92345085")
            .withEmail("kenneth@example.com").withAddress("1st Avenue")
            .withTags("Korean", "Important")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person LEONARD = new PersonBuilder().withName("Leonard Low").withPhone("84325731")
            .withEmail("leonard@example.com").withAddress("2nd Avenue")
            .withTags("Japanese", "Important")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person MICHAEL = new PersonBuilder().withName("Michael Moore").withPhone("94325165")
            .withEmail("michael@example.com").withAddress("3rd Avenue")
            .withTags("Chinese", "Colleague")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person NOEL = new PersonBuilder().withName("Noel Tan").withPhone("85743754")
            .withEmail("noel@example.com").withAddress("4th Avenue")
            .withTags("Rich", "Client")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person OPENHEIMER = new PersonBuilder().withName("Openheimer Ang").withPhone("93424521")
            .withEmail("openheimer@example.com").withAddress("5th Address")
            .withTags("Singaporean", "OCBC")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person PERCY = new PersonBuilder().withName("Percy Jackson").withPhone("83242542")
            .withEmail("percy@example.com").withAddress("6th Avenue")
            .withTags("Singaporean")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person QUINE = new PersonBuilder().withName("Quine Ang").withPhone("94346903")
            .withEmail("quine@example.com").withAddress("7th Avenue")
            .withTags("OCBC")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person RICHARD = new PersonBuilder().withName("Richard Lim").withPhone("87779042")
            .withEmail("richard@example.com").withAddress("8th Avenue")
            .withTags("Singaporean", "POSB")
            .withPicture("/images/placeholder_image.jpg").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    // Untagged persons
    public static final Person OPENHEIMER_UNTAGGED = new PersonBuilder().withName("Openheimer Ang")
            .withPhone("93424521")
            .withEmail("openheimer@example.com").withAddress("5th Address")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person PERCY_UNTAGGED = new PersonBuilder().withName("Percy Jackson").withPhone("83242542")
            .withEmail("percy@example.com").withAddress("6th Avenue")
            .withPicture("/images/placeholder_image.jpg").build();
    public static final Person QUINE_UNTAGGED = new PersonBuilder().withName("Quine Ang").withPhone("94346903")
            .withEmail("quine@example.com").withAddress("7th Avenue")
            .withPicture("/images/place_holder_image.jpg").build();
    public static final Person RICHARD_UNTAGGED = new PersonBuilder().withName("Richard Lim").withPhone("87779042")
            .withEmail("richard@example.com").withAddress("8th Avenue")
            .withTags("POSB")
            .withPicture("/images/place_holder_image.jpg").build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE, HENRY, IANNA, JENNY,
                KENNETH, LEONARD, MICHAEL, NOEL, OPENHEIMER, PERCY, QUINE, RICHARD));
    }
}
