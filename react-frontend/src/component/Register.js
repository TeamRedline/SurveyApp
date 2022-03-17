import React, {Component} from 'react'

import axios from 'axios'


export default class Register extends Component {

    // const [personName, setPersonName] = useState({
    //     firstname: "",
    //     middlename: "",
    //     lastname: "",

    // })
    // const [address, setAddress] = useState({
    //     street: "",
    //     county: "",
    //     city: "",
    //     zipCode: null,

    // })
    // const [course, setCourse] = useState()
    // const [manager, setManager] = useState()


    // const onChange = (e) => {

    //     const { name, value } = e.target
    //     setPersonName((pre) => ({ ...pre, [name]: value }))
    //     setAddress((pre) => ({ ...pre, [name]: value }))
    //     setCourse(e.target.value)
    //     setManager(e.target.value)
    //     console.log(personName)
    //     console.log(manager)
    // }


    // const registerAction = (event) => {


    //     event.preventDefault();


    //     const body = {
    //         personName: {
    //             firstname: personName.firstname,
    //             middlename: personName.middlename,
    //             lastname: personName.lastname,
    //         },


    //         course: course,
    //         manager: manager,
    //         address: {
    //             street: address.street,
    //             country: address.country,
    //             city: address.city,
    //             zipCode: address.zipCode
    //         }


    //     }s


    state = {
        firstname: "",
        middlename: "",
        lastname: "",
        street: "",
        county: "",
        city: "",
        zipCode: null,
        course: null,
        manager: null,
    }


    onChange = (e) => {

        const {name, value} = e.target
        this.setState({
                [name]: value
            }
        )
        console.log(this.state)
    }


    registerAction = (event) => {


        event.preventDefault();

        const {firstName, lastName, middleName, street, city, country, zipCode, course, manager} = this.state


        const body = {


            course: course,
            manager: manager,
            address: {
                street: street,
                country: country,
                city: city,
                zipCode: zipCode
            },
            personName: {
                firstName: firstName,
                middleName: middleName,
                lastName: lastName,
            }


        }
        console.log(body)

        axios.post("http://localhost:8082/teacher", body)


    }

    render() {


        return (
            <div className='ui  column grid container ' style={{padding: 10, paddingLeft: 120}}>
                <div class="ui vertical menu four wide column inverted"
                     style={{position: 'absolute', left: -150, top: 50}}>
                    <div class="item">
                        <div class="ui input"><input type="text" placeholder="Search..."/></div>
                    </div>
                    <div class="item">
                        Home
                        <div class="menu">
                            <a class="active item">Search</a>
                            <a class="item">Add</a>
                            <a class="item">Remove</a>
                        </div>
                    </div>
                    <a class="item">
                        <i class="grid layout icon"></i> Browse
                    </a>
                    <a class="item">
                        Messages
                    </a>
                    <div class="ui dropdown item">
                        More
                        <i class="dropdown icon"></i>
                        <div class="menu">
                            <a class="item"><i class="edit icon"></i> Edit Profile</a>
                            <a class="item"><i class="globe icon"></i> Choose Language</a>
                            <a class="item"><i class="settings icon"></i> Account Settings</a>
                        </div>
                    </div>
                </div>


                <div className='ui raised very padded text container segment thirteen wide column'>
                    <form class="ui form ui five row doubling  container">

                        <h4 class="ui dividing header">Teacher Information</h4>
                        <div class="field row">

                            <div class="two fields">

                                <div class="field">
                                    <label>First Name</label>
                                    <input type="text" name="firstName" placeholder="First Name"
                                           onChange={this.onChange}/>
                                </div>

                                <div class="field">
                                    <label>Last Name</label>
                                    <input type="text" name="lastName" placeholder="Last Name"
                                           onChange={this.onChange}/>
                                </div>
                            </div>
                        </div>
                        <div class="field row">
                            <label>Personel Address</label>
                            <div class="fields">
                                <div class="twelve wide field">
                                    <input type="text" name="street" placeholder="Street Address"
                                           onChange={this.onChange}/>
                                </div>
                                <div class="four wide field">
                                    <input type="text" name="zipCode" placeholder="zip code" onChange={this.onChange}/>
                                </div>
                            </div>
                        </div>
                        <div class="two fields row">
                            <div class="field">
                                <label>State</label>
                                <select class="ui fluid dropdown" name='city' onChange={this.onChange}>
                                    <option value="">State</option>
                                    <option value="AL">Alabama</option>

                                </select>
                            </div>
                            <div class="field">
                                <label>Country</label>
                                <div class="ui fluid search selection dropdown">
                                    <input type="hidden" name="country" onChange={this.onChange}/>
                                    <i class="dropdown icon"></i>
                                    <div class="default text">Select Country</div>
                                    <div class="menu">
                                        <div class="item" data-value="af"><i class="af flag"></i>Afghanistan</div>

                                    </div>
                                </div>
                            </div>
                        </div>
                        <h4 class="ui dividing header"> Information</h4>
                        <div class="three fields row">
                            <div class="field">
                                <label>Branch</label>
                                <select class="ui fluid dropdown" name='branch' onChange={this.onChange}>
                                    <option value="">Branc</option>
                                    <option value="AL">Alabama</option>

                                </select>
                            </div>
                            <div class="field">
                                <label>Manager</label>
                                <div class="ui fluid search selection dropdown">
                                    <input type="hidden" name="manager" onChange={this.onChange}/>
                                    <i class="dropdown icon"></i>
                                    <div class="default text">Select Country</div>
                                    <div class="menu">
                                        <div class="item" data-value="af"><i class="af flag"></i>Afghanistan</div>

                                    </div>
                                </div>
                            </div>
                            <div class="field">
                                <label>Courses</label>
                                <select class="ui fluid dropdown" name='course' onChange={this.onChange}>
                                    <option value="">Branc</option>
                                    <option value="AL">Alabama</option>

                                </select>
                            </div>
                        </div>
                        <br/> <br/>
                        <div class="fields row">
                            <div class="ui form six wide field">
                                <div class="grouped fields">
                                    <label>Chooser Trainer Type?</label>
                                    <div class="field">
                                        <div class="ui radio checkbox">
                                            <input type="radio" name="example2" value="masterTrainer" checked="checked"
                                                   onChange={this.onChange}/>
                                            <label>Master Trainer</label>
                                        </div>
                                    </div>
                                    <div class="field">
                                        <div class="ui radio checkbox">
                                            <input type="radio" name="example2" value="assistanTrainer"
                                                   onChange={this.onChange}/>
                                            <label>Assistane Trainer</label>
                                        </div>
                                    </div>
                                </div>

                            </div>
                            <div class="six wide field">
                                <label>Years Of Experiance</label>
                                <input type="text" name="yearsOfExperiance" placeholder=" Years Of Experiance"
                                       onChange={this.onChange}/>
                            </div>

                            <div class="six wide field">
                                <label>Topic</label>
                                <div class="two fields">
                                    <div class="field">
                                        <select class="ui fluid search dropdown" name="topic" onChange={this.onChange}>
                                            <option value="">Month</option>
                                            <option value="1">January</option>
                                            <option value="2">February</option>
                                            <option value="3">March</option>
                                            <option value="4">April</option>
                                            <option value="5">May</option>
                                            <option value="6">June</option>
                                            <option value="7">July</option>
                                            <option value="8">August</option>
                                            <option value="9">September</option>
                                            <option value="10">October</option>
                                            <option value="11">November</option>
                                            <option value="12">December</option>
                                        </select>
                                    </div>

                                </div>
                            </div>
                        </div>
                        <br/> <br/> <br/> <br/>


                        <div class="ui button primary" tabindex="0" onClick={this.registerAction}>Submit</div>
                    </form>
                </div>

            </div>

        )
    }
}

