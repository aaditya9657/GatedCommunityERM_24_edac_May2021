import React from 'react';
class Maintenance extends React.Component
{
    constructor(props)
    {
        super(props); 
    }

    render()
    {
        var dis= [];
        
        for (const iterator of this.props.c_h.maintenance)
        {
            // console.log(iterator);
            var added = false;
            for (const iterator1 of dis) 
            {
                if(iterator1.begin_date == iterator.begin_date && iterator1.end_date == iterator.end_date)
                {
                    added = true;
                    // iterator1.maintenance.push(iterator);
                    if(iterator.maintenance_type.type=="Electricity Charges")
                    {
                        iterator1.maintenance1=iterator;
                    }
                    else if(iterator.maintenance_type.type=="Parking Charges")
                    {
                        iterator1.maintenance2=iterator;
    
                    }
                    else if(iterator.maintenance_type.type=="Construction And Repair Funds")
                    {
                        iterator1.maintenance3=iterator;
    
                    }
                    else if(iterator.maintenance_type.type=="Water Taxes")
                    {
                        iterator1.maintenance4=iterator;
    
                    }
                    else if(iterator.maintenance_type.type=="Security Charges")
                    {
                        iterator1.maintenance5=iterator;
    
                    }
                    else if(iterator.maintenance_type.type=="Other Charges")
                    {
                        iterator1.maintenance6=iterator;
    
                    }
                }
            }
            if(added==false)
            {
                const obj = new Object();
                obj.begin_date = iterator.begin_date;
                obj.end_date = iterator.end_date;
                if(iterator.maintenance_type.type=="Electricity Charges")
                {
                    obj.maintenance1=iterator;
                }
                else if(iterator.maintenance_type.type=="Parking Charges")
                {
                    obj.maintenance2=iterator;

                }
                else if(iterator.maintenance_type.type=="Construction And Repair Funds")
                {
                    obj.maintenance3=iterator;

                }
                else if(iterator.maintenance_type.type=="Water Taxes")
                {
                    obj.maintenance4=iterator;

                }
                else if(iterator.maintenance_type.type=="Security Charges")
                {
                    obj.maintenance5=iterator;

                }
                else if(iterator.maintenance_type.type=="Other Charges")
                {
                    obj.maintenance6=iterator;

                }
                dis.push(obj);
            }

        }

        var dis1 = [];
              
         for (const iterator of dis)
        {
            let total = 0;
            const obj = new Object();
            obj.begin_date = <td>{iterator.begin_date}</td>;
            obj.end_date = <td>{iterator.end_date}</td>;
            if(typeof iterator.maintenance1!='undefined')
            {
                obj.e1 = <td>{iterator.maintenance1.cost}</td>;
                total += parseFloat(iterator.maintenance1.cost);
            }
            else
            {
                obj.e1 = <td>0</td>;
    
            }
            if(typeof iterator.maintenance2!='undefined')
            {
                obj.e2 = <td>{iterator.maintenance2.cost}</td>;
                total += parseFloat(iterator.maintenance2.cost);
            }
            else
            {
                obj.e2 = <td>0</td>;
                   
            }
            if(typeof iterator.maintenance3!='undefined')
            {
                obj.e3 = <td>{iterator.maintenance3.cost}</td>;
                total += parseFloat(iterator.maintenance3.cost);
            }
            else
            {
                obj.e3 = <td>0</td>;
                   
            }
            if(typeof iterator.maintenance4!='undefined')
            {
                obj.e4 = <td>{iterator.maintenance4.cost}</td>;
                total += parseFloat(iterator.maintenance4.cost);
            }
            else
            {
                obj.e4 = <td>0</td>;
                   
            }
            if(typeof iterator.maintenance5!='undefined')
            {
                obj.e5 = <td>{iterator.maintenance5.cost}</td>;
                total += parseFloat(iterator.maintenance5.cost);
            }
            else
            {
                obj.e5 = <td>0</td>;
                   
            }
            if(typeof iterator.maintenance6!='undefined')
            {
                obj.e6 = <td>{iterator.maintenance6.cost}</td>;
                total += parseFloat(iterator.maintenance6.cost);
            }
            else
            {
                obj.e6 = <td>0</td>;
                   
            }
            obj.total = <td>{total}</td>;
            dis1.push(obj);
    
        }   
        
        var dis2 =[];
        for (const iterator of dis1) 
        {
            console.log(iterator);
            dis2.push(<tr>{iterator.begin_date}{iterator.end_date}{iterator.e1}{iterator.e2}{iterator.e3}{iterator.e4}{iterator.e5}{iterator.e6}{iterator.total}</tr>)
            
        }

        console.log(dis2);
        return(
            <div>
                <table className="table table-striped table-bordered container" style={{marginTop:"30px"}}>
                    <thead>
                        <tr style={{backgroundColor:"lightsalmon"}}>
                            <th>
                                Begin Date
                            </th>
                            <th>
                                End Date
                            </th>
                            <th>
                                Electricity Charges
                            </th>
                            <th>
                                Parking Charges
                            </th>
                            <th>
                               Construction and Repair Funds
                            </th>
                            <th>
                                Water Taxes
                            </th>
                            <th>
                                Security Charges
                            </th>
                            <th>
                                Other Charges
                            </th>
                            <th>
                                Total Charges
                            </th>

                        </tr>
                    </thead>
                    <tbody style={{backgroundColor:"papayawhip",textAlign:"center"}}>
                            {dis2.map((value) => { return value})}
                       
                    </tbody>
                </table>
             
            </div>
        );
                
        }        
        
    }

export default Maintenance;