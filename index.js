
import express, { urlencoded }  from "express";
import { indexController, aboutController, editController, contactController } from "./Controllers/indexController.js";
import { deleteController, edittController, submitController, updateController } from "./Controllers/submitController.js";
import { dbLoginController, dbRegistrasiController, loginController, logoutController, RegistrasiController } from "./Controllers/userController.js";
const app = express();

app.use(urlencoded ({extended:true}))

 app.set("view engine", "ejs");
 app.get("/", indexController);
app.get("/about", aboutController );
app.get("/contact", contactController);
app.post("/submit" , submitController);

app.get("/update/:id", updateController );
app.get("/delete/:id", deleteController );
app.get("/edit/:id", editController);
app.get("/edit/:id", edittController );

app.get("/registrasi", RegistrasiController);
app.post("/registrasi", dbRegistrasiController);

app.get("/login", loginController);
app.post("/login", dbLoginController);

app.get("/logout", logoutController);
app.listen(3000, function() {
  console.log("umumumumu")
})