import React, {useState} from 'react'
import {TextField} from '@material-ui/core'
import {Button, FormControl} from '@mui/material'

const EditBooleanQuestion = () => {
    const [formSignup, setForm] = useState({

        option1: null,
        option2: null
    })
    const [title, setTitle] = useState()


    const onChange = e => {
        const {name, value} = e.target

        setForm((previousForm) => ({...previousForm, [name]: value}))
        console.log(formSignup)
    }
    return (

        <div>
            <FormControl>

                <label>Başlık</label>
                <TextField
                    name='title'

                    onChange={onChange}


                ></TextField>
                <label>Option 1</label>
                <TextField
                    name='option1'


                > </TextField>
                <label>Option 2</label>
                <TextField
                    name='option2'
                    onChange={onChange}


                > </TextField>
                <Button>Kaydet</Button>
            </FormControl>

        </div>

    )
}
export default EditBooleanQuestion