package com.example.sweeBoot.cookie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CookieConfig {

    @Bean
    CommandLineRunner commandLineRunner(CookieRepository repository) {
        return args -> {
            Cookie peanutButterCookies = new Cookie(
                    "Peanut Butter Cookies",
                    List.of("1 cup shortening",
                            "1 cup peanut butter",
                            "1 cup sugar",
                            "1 cup packed brown sugar",
                            "3 large eggs, room temperature",
                            "3 cups all-purpose flour",
                            "2 teaspoons baking soda",
                            "1/4 teaspoon salt"),
                    "Preheat oven to 375°. In a large bowl, cream shortening, peanut butter and sugars until light and fluffy, 5-7 minutes. Add eggs, 1 at a time, beating well after each addition. Combine flour, baking soda and salt; add to creamed mixture and mix well.\n" +
                            " Roll into 1-1/2-in. balls. Place 3 in. apart on ungreased baking sheets. Flatten with a fork or meat mallet if desired. Bake 10-15 minutes. Remove to wire racks to cool."
            );

            Cookie jumboBrownieCookies = new Cookie(
                    "Jumbo Brownie Cookies",
                    List.of("2-2/3 cups 60% cacao bittersweet chocolate baking chips",
                            "1/2 cup unsalted butter, cubed",
                            "4 large eggs, room temperature",
                            "1-1/2 cups sugar",
                            "4 teaspoons vanilla extract",
                            "2 teaspoons instant espresso powder, optional",
                            "2/3 cup all-purpose flour",
                            "1/2 teaspoon baking powder",
                            "1/4 teaspoon salt",
                            "1 package (11-1/2 ounces) semisweet chocolate chunks"),
                    "Preheat oven to 350°. In a large saucepan, melt chocolate chips and butter over low heat, stirring until smooth. Remove from the heat; cool until mixture is warm.\n" +
                            "In a small bowl, whisk the eggs, sugar, vanilla and, if desired, espresso powder until blended. Whisk into chocolate mixture. In another bowl, mix the flour, baking powder and salt; add to chocolate mixture, mixing well. Fold in chocolate chunks; let stand until mixture thickens slightly, about 10 minutes.\n" +
                            "Drop by 1/4 cupfuls 3 in. apart onto parchment-lined baking sheets. Bake until set, 12-14 minutes. Cool on pans 1-2 minutes. Remove to wire racks to cool."
            );

            Cookie vanillaMeringueCookies = new Cookie(
                    "Vanilla Meringue Cookies",
                    List.of("3 large egg whites",
                            "1-1/2 teaspoons clear or regular vanilla extract",
                            "1/4 teaspoon cream of tartar",
                            "Dash salt",
                            "2/3 cup sugar"),
                    "Place egg whites in a small bowl; let stand at room temperature 30 minutes.\n" +
                            "Preheat oven to 250°. Add vanilla, cream of tartar and salt to egg whites; beat on medium speed until foamy. Gradually add sugar, 1 tablespoon at a time, beating on high after each addition until sugar is dissolved. Continue beating until stiff glossy peaks form, about 7 minutes.\n" +
                            "Cut a small hole in the tip of a pastry bag or in a corner of a food-safe plastic bag; insert a #32 star tip. Transfer meringue to bag. Pipe 1-1/4-in.-diameter cookies 2 in. apart onto parchment-lined baking sheets.\n" +
                            "Bake until firm to the touch, 40-45 minutes. Turn off oven; leave meringues in oven 1 hour (leave oven door closed). Remove from oven; cool completely on baking sheets. Remove meringues from paper; store in an airtight container at room temperature."
            );

            Cookie coconutMacaroons = new Cookie(
                    "Coconut Macaroons",
                    List.of("1-1/3 cups sweetened shredded coconut",
                            "1/3 cup sugar",
                            "2 tablespoons all-purpose flour",
                            "1/8 teaspoon salt",
                            "2 large egg whites, room temperature",
                            "1/2 teaspoon vanilla extract"),
                    "In a small bowl, combine the coconut, sugar, flour and salt. Add egg whites and vanilla; mix well.\n" +
                            "Drop by rounded teaspoonfuls onto greased baking sheets. Bake at 325° for 18-20 minutes or until golden brown. Cool on a wire rack."
            );

            Cookie cherryChocolateNutCookies = new Cookie(
                    "Cherry Chocolate Nut Cookies",
                    List.of("1/2 cup butter, softened",
                            "1/2 cup sugar",
                            "1/2 cup packed brown sugar",
                            "1 large egg",
                            "1/4 cup 2% milk",
                            "1 teaspoon vanilla extract",
                            "2 cups all-purpose flour",
                            "1 teaspoon baking powder",
                            "1/2 teaspoon salt",
                            "1/4 teaspoon baking soda",
                            "1 cup semisweet chocolate chips",
                            "3/4 cup chopped maraschino cherries",
                            "3/4 cup chopped pecans"),
                    "In a large bowl, cream butter and sugars until light and fluffy. Beat in the egg, milk and vanilla. Combine the flour, baking powder, salt and baking soda; gradually add to creamed mixture and mix well. Stir in the remaining ingredients.\n" +
                            "Drop by tablespoonfuls 2 in. apart onto greased baking sheets. Bake at 375° for 10-12 minutes or until golden brown. Remove to wire racks to cool."
            );

            Cookie amishSugarCookies = new Cookie(
                    "Amish Sugar Cookies",
                    List.of("1 cup butter, softened",
                            "1 cup vegetable oil",
                            "1 cup sugar",
                            "1 cup confectioners' sugar",
                            "2 large eggs, room temperature",
                            "1 teaspoon vanilla extract",
                            "4-1/2 cups all-purpose flour",
                            "1 teaspoon baking soda",
                            "1 teaspoon cream of tartar"),
                    "Preheat oven to 375°. In a large bowl, beat the butter, oil and sugars. Beat in eggs until well blended. Beat in vanilla. Combine the flour, baking soda and cream of tartar; gradually add to creamed mixture.\n" +
                            "Drop by small teaspoonfuls onto ungreased baking sheets. Bake until lightly browned, 8-10 minutes. Remove to wire racks to cool."
            );

            Cookie chewyChocolateCookies = new Cookie(
                    "Chewy Chocolate Cookies",
                    List.of("1-1/4 cups butter, softened",
                            "2 cups sugar",
                            "2 large eggs, room temperature",
                            "2 teaspoons vanilla extract",
                            "2 cups all-purpose flour",
                            "3/4 cup baking cocoa",
                            "1 teaspoon baking soda",
                            "1/2 teaspoon salt",
                            "2 cups semisweet chocolate chips"),
                    "Preheat oven to 350°. In a large bowl, cream butter and sugar until light and fluffy. Beat in eggs and vanilla. In another bowl, whisk flour, cocoa, baking soda and salt; gradually add to creamed mixture. Stir in chips.\n" +
                            "Drop by teaspoonfuls onto lightly greased baking sheets. Bake 8-10 minutes (do not overbake). Cool on pans 1 minute. Remove to wire racks to cool."
            );

            Cookie chippyPeanutButterCookies = new Cookie(
                    "Chippy Peanut Butter Cookies",
                    List.of("1 cup butter, softened",
                            "1 cup creamy peanut butter",
                            "1 cup sugar",
                            "1 cup packed brown sugar",
                            "2 large eggs",
                            "1 teaspoon vanilla extract",
                            "2-1/4 cups all-purpose flour",
                            "2 teaspoons baking soda",
                            "1/4 teaspoon salt",
                            "1 package (11 ounces) peanut butter and milk chocolate chips"),
                    "In a large bowl, cream the butter, peanut butter and sugars until light and fluffy. Beat in eggs and vanilla. Combine the flour, baking soda and salt; gradually add to creamed mixture and mix well. Stir in chips.\n" +
                            "Drop by rounded tablespoonfuls onto ungreased baking sheets. Bake at 350° for 12-15 minutes or until golden brown. Cool for 2 minutes before removing to wire racks."
            );

            Cookie chocolateChipOatmealCookies = new Cookie(
                    "Chocolate Chip Oatmeal Cookies",
                    List.of("1 cup butter, softened",
                            "3/4 cup sugar",
                            "3/4 cup packed brown sugar",
                            "2 large eggs",
                            "1 teaspoon vanilla extract",
                            "3 cups quick-cooking oats",
                            "1-1/2 cups all-purpose flour",
                            "1 package (3.4 ounces) instant vanilla pudding mix",
                            "1 teaspoon baking soda",
                            "1 teaspoon salt",
                            "2 cups semisweet chocolate chips",
                            "1 cup chopped nuts"),
                    "In a large bowl, cream butter and sugars until light and fluffy. Beat in eggs and vanilla. Combine the oats, flour, dry pudding mix, baking soda and salt; gradually add to creamed mixture and mix well. Stir in chocolate chips and nuts.\n" +
                            "Drop by level tablespoonfuls 2 in. apart onto ungreased baking sheets. Bake at 375° for 10-12 minutes or until lightly browned. Remove to wire racks."
            );

            Cookie whiteChocolateMacadamiaCookies = new Cookie(
                    "White Chocolate Macadamia Cookies",
                    List.of("1/2 cup butter, softened",
                            "2/3 cup sugar",
                            "1 large egg",
                            "1 teaspoon vanilla extract",
                            "1 cup plus 2 tablespoons all-purpose flour",
                            "1/2 teaspoon baking soda",
                            "1 cup macadamia nuts, chopped",
                            "1 cup white baking chips"),
                    "Preheat oven to 350°. In a large bowl, cream butter and sugar until light and fluffy. Beat in egg and vanilla. In another bowl, whisk flour and baking soda; gradually beat into creamed mixture. Stir in nuts and baking chips.\n" +
                            "Drop by heaping teaspoonfuls 2 in. apart onto ungreased baking sheets. Bake 10-12 minutes or until golden brown. Cool on pans 1 minute. Remove to wire racks to cool completely.\n" +
                            "Freeze option: Freeze cookies, layered between waxed paper, in freezer containers. To use, thaw before serving or, if desired, reheat on a baking sheet in a preheated 350° oven 3-4 minutes."
            );


            repository.saveAll(
                    List.of(peanutButterCookies,
                            jumboBrownieCookies,
                            vanillaMeringueCookies,
                            coconutMacaroons,
                            cherryChocolateNutCookies,
                            amishSugarCookies,
                            chewyChocolateCookies,
                            chippyPeanutButterCookies,
                            chocolateChipOatmealCookies,
                            whiteChocolateMacadamiaCookies)
            );
        };
    }
}
